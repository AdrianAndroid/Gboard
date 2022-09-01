package defpackage;

/* compiled from: PG */
/* renamed from: iil  reason: default package */
/* loaded from: classes.dex */
public final class iil {
    public static final iil a = a("Uncategorized", mbn.UNKNOWN_SEARCH_FEATURE);
    public static final iil b = a("Autocomplete", mbn.AUTOCOMPLETE);
    public static final iil c = a("Local", mbn.LOCAL);
    public static final iil d = a("TenorTrendingMetadata", mbn.TENOR_GIF_TRENDING_METADATA);
    public static final iil e = a("TenorFeaturedMetadata", mbn.TENOR_FEATURED_METADATA);
    public static final iil f = a("TenorAnimatedImage", mbn.TENOR_GIF_FULL_IMAGE);
    public static final iil g = a("TenorStaticImage", mbn.TENOR_STATIC_IMAGE);
    public static final iil h = a("TenorImageThumbnail", mbn.TENOR_GIF_THUMBNAIL);
    public static final iil i = a("TenorCategoryMetadata", mbn.TENOR_GIF_CATEGORY_METADATA);
    public static final iil j = a("TenorGifSearchMetadata", mbn.TENOR_GIF_SEARCH_METADATA);
    public static final iil k = a("TenorStickerSearchMetadata", mbn.TENOR_STICKER_SEARCH_METADATA);
    public static final iil l = a("Gif", mbn.GIS_GIF_FULL_IMAGE);
    public static final iil m = a("GifThumbnail", mbn.GIS_GIF_THUMBNAIL);
    public static final iil n = a("GifMetadata", mbn.GIS_GIF_METADATA);
    public static final iil o = a("BitmojiImage", mbn.BITMOJI_IMAGE);
    public static final iil p = a("StickerImage", mbn.EXPRESSIVE_STICKER_IMAGE);
    public static final iil q = a("CuratedImage", mbn.CURATED_IMAGE);
    public static final iil r = a("TenorTrendingSearchTermMetadata", mbn.TENOR_TRENDING_SEARCH_TERM_METADATA);
    public static final iil s = a("TenorAutocompleteMetadata", mbn.TENOR_AUTOCOMPLETE_METADATA);
    public static final iil t = a("ExpressiveStickerMetadata", mbn.EXPRESSIVE_STICKER_METADATA);
    public final String u;
    public final mbn v;

    static {
        a("Uncategorized", mbn.UNKNOWN_GRPC_FEATURE);
        a("PlaystoreStickerImage", mbn.PLAYSTORE_STICKER_IMAGE);
        a("TenorSearchSuggestionMetadata", mbn.TENOR_GIF_SEARCH_SUGGESTION_METADATA);
    }

    public iil(String str, mbn mbnVar) {
        this.u = str;
        if (mbnVar != null) {
            this.v = mbnVar;
            return;
        }
        throw new NullPointerException("Null searchFeature");
    }

    protected static iil a(String str, mbn mbnVar) {
        return new iil(str, mbnVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iil) {
            iil iilVar = (iil) obj;
            if (this.u.equals(iilVar.u) && this.v.equals(iilVar.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.u.hashCode() ^ 1000003) * 1000003) ^ this.v.hashCode();
    }

    public final String toString() {
        String str = this.u;
        String obj = this.v.toString();
        return "NetworkRequestFeature{featureName=" + str + ", searchFeature=" + obj + "}";
    }

    public iil() {
    }
}
