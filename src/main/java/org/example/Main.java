package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.concurrent.*;

public class Main {

    private static final int CARS_COUNT_IN_TUNNEL = 3;
    private static final int CARS_COUNT = 10;

    private static final Semaphore tunnelSemaphore = new Semaphore(CARS_COUNT_IN_TUNNEL);
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static final CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
    private static final Map<Integer, Long> score = new ConcurrentHashMap<>();
    private static final CountDownLatch countDownLatch = new CountDownLatch(CARS_COUNT);

    private static int winnerIndex = -1;
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or \"stop\" to exit");
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File file2 = new File("users.usr");
        try (ObjectInputStream objectInputStream = new ObjectInputStream((new FileInputStream(file2)))) {
            User savedUser = (User) objectInputStream.readObject();
            System.out.println(savedUser);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File file3 = new File("cats.cat");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file3))) {
            List<Cat> cats = (List<Cat>) objectInputStream.readObject();
            for (Cat cat : cats) {
                System.out.println(cat.getName());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<Float> numbers3 = new ArrayList<>();
        for (int i = 0; i < 30_000_000; i++) {
            numbers3.add((float) i);
        }
        long before = System.currentTimeMillis();
        numbers3.parallelStream()
                .map((number) -> Math.sin(0.2f + number / 5) * Math.cos(0.2f + number / 5) * Math.cos(0.4f + number / 2))
                .toList();
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        for (int i = 0; i < CARS_COUNT; i++) {
            final int index = i;
            executorService.execute(() -> {
                prepare(index);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                long before1 = System.currentTimeMillis();
                roadFirst(index);
                tunnel(index);
                roadSecond(index);
                synchronized (monitor) {
                    if (winnerIndex == -1) {
                        winnerIndex = index;
                    }
                }
                long after1 = System.currentTimeMillis();
                score.put(index, after1 - before1);
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int key : score.keySet()) {
            System.out.println(key + " " + score.get(key));
        }
        System.out.println("Winner " + winnerIndex + " Time: " + score.get(winnerIndex));

        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Случайное число %s. Попробуйте еще раз...", random);
        System.out.println(result);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesAndNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Андрей");
        names.add("Катя");
        names.add("Настя");
        names.add("Антон");
        names.add("Женя");
        names.add("Дима");
        names.add("Коля");
        names.add("Мария");
        names.add("Роман");
        names.add("Павел");
        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " - " + names.get(i);
            namesAndNumbers.add(s);
        }
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }

        String sourceData = "Это Иван. Ему 34 года. Его рост 166.3 см. Должность \"Программист\"";
        String name = sourceData.substring(4, 8);
        String ageString = sourceData.substring(14, 16);
        int age = Integer.parseInt(ageString);
        String heightString = sourceData.substring(32, 37);
        double height = Double.parseDouble(heightString);
        String position = sourceData.substring(53, 64);
        Man man = new Man(name, position, age, height);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года " + man.getHeight() + "см.");

        Dog dog = new Dog();
        dog.name = "Rex";
        dog.breed = "Pit bull";
        dog.speed = 5;
        dog.run();
        System.out.println(dog.info());

        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.area());
        System.out.println(triangle.area());

        Programmer programmer1 = new Programmer("Adi");
        Programmer programmer2 = new Programmer("Madi");
        Programmer programmer3 = new Programmer("Shadi");
        Driver driver1 = new Driver("Sadi");
        Driver driver2 = new Driver("Body");
        Driver driver3 = new Driver("Tidy");
        Cooker cooker1 = new Cooker("Diddy");
        Cooker cooker2 = new Cooker("Lady");
        Cooker cooker3 = new Cooker("Willy");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Drivable driver : drivers) {
            driver.drive();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cookable cookable : cookers) {
            cookable.cook();
        }

        Director director = new Director();
        Worker worker = (n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Working");
            }
            return "Success";
        };
        String res = director.force(worker, 5);
        System.out.println(res);

        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1, 1, 1);
        Monster monster3 = new Monster(4, 2);
        monster1.voice();
        monster2.voice(3);
        monster3.voice(5, "Я монстр 3");

        Set<Integer> numbers1 = new TreeSet<>((o1, o2) -> -o1.compareTo(o2));
        for (int i = 0; i < 100; i++) {
            numbers1.add((int) (Math.random() * 10));
        }
        for (int number : numbers1) {
            System.out.println(number);
        }

        HashMap<CarOwner, Car> map = new HashMap<>();
        CarOwner key = new CarOwner(1, "Name", "LastName");
        map.put(key, new Car("Brand1", 1));
        key.setId(8);
        for (CarOwner carOwner : map.keySet()) {
            System.out.println(carOwner.getId());
        }

        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers2.add((int) (Math.random() * 100 + 100));
        }
        List<String> result2 = numbers2.stream()
                .filter((integer -> integer % 2 == 0 && integer % 5 == 0))
                .map((Math::sqrt))
                .map((sqrt) -> "Sqrt: " + sqrt)
                .toList();
        for (String s : result2) {
            System.out.println(s);
        }
    }

    private static List<String> map(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int number : numbers) {
            result.add("Number: " + number);
        }
        return result;
    }

    private static List<Integer> filter(List<Integer> list, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static void sleepRandomTime() {
        long millis = (long) (Math.random() * 5000 + 1000);
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void prepare(int index) {
        System.out.println(index + " started preparing");
        sleepRandomTime();
        System.out.println(index + " finished preparing");
    }

    private static void roadFirst(int index) {
        System.out.println(index + " started roadFirst");
        sleepRandomTime();
        System.out.println(index + " finished roadFirst");
    }

    private static void roadSecond(int index) {
        System.out.println(index + " started roadSecond");
        sleepRandomTime();
        System.out.println(index + " finished roadSecond");
    }

    private static void tunnel(int index) {
        try {
            tunnelSemaphore.acquire();
            System.out.println(index + " started tunnel");
            sleepRandomTime();
            System.out.println(index + " finished tunnel");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            tunnelSemaphore.release();
        }
    }
}
