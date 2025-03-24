package org.example.tasks;

import java.time.LocalDateTime;

public class WebsiteVisit {
    private String username;
    private String visitedSite;
    private LocalDateTime visitDate;

    public WebsiteVisit(String username, String visitedSite, LocalDateTime visitDate) {
        this.username = username;
        this.visitedSite = visitedSite;
        this.visitDate = visitDate;
    }

    public String getUsername() {
        return username;
    }

    public String getVisitedSite() {
        return visitedSite;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    @Override
    public String toString() {
        return "WebsiteVisit{" +
                "username='" + username + '\'' +
                ", visitedSite='" + visitedSite + '\'' +
                ", visitDate=" + visitDate +
                '}';
    }
}
