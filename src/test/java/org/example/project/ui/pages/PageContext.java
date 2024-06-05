package org.example.project.ui.pages;

public class PageContext {
    private static CommonPage currentPage;

    public static CommonPage getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(CommonPage page) {
        currentPage = page;
    }
}
