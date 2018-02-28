package np.com.jdulal.mywallpaper.Model;

/**
 * Created by jdulal on 2/27/2018.
 */

public class WallpaperItem {
    public String imageUrl;
    public String categoryId;

    public WallpaperItem() {
    }

    public WallpaperItem(String imageUrl, String categoryId) {
        this.imageUrl = imageUrl;
        this.categoryId = categoryId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
