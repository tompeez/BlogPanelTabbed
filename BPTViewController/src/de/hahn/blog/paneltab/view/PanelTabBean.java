package de.hahn.blog.paneltab.view;

public class PanelTabBean {
    private String selectedVerticalTabMode = "iconOnly";

    public void setSelectedVerticalTabMode(String selectedVerticalTabMode) {
        this.selectedVerticalTabMode = selectedVerticalTabMode;
    }

    public String getSelectedVerticalTabMode() {
        return selectedVerticalTabMode;
    }

    public PanelTabBean() {
    }
}
