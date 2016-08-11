package com.sankalpapps.nutrients;

/**
 * Created by Sankalp on 26-06-2016.
 */
public class Note {
    private String title, message;
    private long noteId, dateCreatedMilli;
    private Category category;

    public enum Category {VITAMIN_A, VITAMIN_C, VITAMIN_E, DIETARY_FIBER, FOLIC_ACID, IRON, MAGNESIUM, OMEGA_3, CALCIUM, PROTEIN}

    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.noteId = 0;
        this.dateCreatedMilli = 0;
        this.category = category;
    }

    public Note(String title, String message, long noteId, long dateCreatedMilli, Category category) {
        this.title = title;
        this.message = message;
        this.noteId = noteId;
        this.dateCreatedMilli = dateCreatedMilli;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
    }

    public long getDateCreatedMilli() {
        return dateCreatedMilli;
    }

    public void setDateCreatedMilli(long dateCreatedMilli) {
        this.dateCreatedMilli = dateCreatedMilli;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", noteId=" + noteId +
                ", dateCreatedMilli=" + dateCreatedMilli +
                ", category=" + category +
                '}';
    }

    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }


    public static int categoryToDrawable(Category noteCategory) {

        switch (noteCategory) {
            case VITAMIN_A:
                return R.drawable.vitamin_a;
            case VITAMIN_C:
                return R.drawable.vitamin_c;
            case DIETARY_FIBER:
                return R.drawable.fibre;
            case VITAMIN_E:
                return R.drawable.vitamin_e;
            case FOLIC_ACID:
                return R.drawable.folic_acid;
            case IRON:
                return R.drawable.iron;
            case MAGNESIUM:
                return R.drawable.magnesium;
            case OMEGA_3:
                return R.drawable.omega_3;
            case CALCIUM:
                return R.drawable.calcium;
            case PROTEIN:
                return R.drawable.protein;

        }
        return R.drawable.p;
    }

}
