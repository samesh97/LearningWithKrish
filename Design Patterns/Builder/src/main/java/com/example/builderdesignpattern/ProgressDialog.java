package com.example.builderdesignpattern;

public class ProgressDialog
{
    private String title;
    private String body;
    private boolean isTouchOutsideCancel;
    private String backgroundColor;
    private String textColor;

    public ProgressDialog(Builder builder)
    {
        this.title = builder.title;
        this.body = builder.body;
        this.isTouchOutsideCancel = builder.isTouchOutsideCancel;
        this.backgroundColor = builder.backgroundColor;
        this.textColor = builder.textColor;
    }

    @Override
    public String toString() {
        return "ProgressDialog{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", isTouchOutsideCancel=" + isTouchOutsideCancel +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }

    public static class Builder
    {
        private String title;
        private String body;
        private boolean isTouchOutsideCancel;
        private String backgroundColor;
        private String textColor;

        public Builder title(String title)
        {
            this.title = title;
            return this;
        }
        public Builder body(String body)
        {
            this.body = body;
            return this;
        }
        public Builder touch(boolean status)
        {
            this.isTouchOutsideCancel = status;
            return this;
        }
        public Builder backgroundColor(String color)
        {
            this.backgroundColor = color;
            return this;
        }
        public Builder textColor(String color)
        {
            this.textColor = color;
            return this;
        }

        public ProgressDialog build()
        {
            return new ProgressDialog(this);
        }
    }
}
