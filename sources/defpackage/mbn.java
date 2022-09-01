package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: mbn  reason: default package */
/* loaded from: classes.dex */
public enum mbn implements nfp {
    UNKNOWN_SEARCH_FEATURE(0),
    STICKER_JSON(1),
    GIS_GIF_METADATA(2),
    GIS_GIF_THUMBNAIL(3),
    GIS_GIF_FULL_IMAGE(4),
    TENOR_GIF_SEARCH_METADATA(5),
    TENOR_GIF_TRENDING_METADATA(6),
    TENOR_GIF_THUMBNAIL(7),
    TENOR_GIF_FULL_IMAGE(8),
    AUTOCOMPLETE(9),
    TENOR_GIF_CATEGORY_METADATA(10),
    EXPRESSIVE_STICKER_METADATA(11),
    EXPRESSIVE_STICKER_IMAGE(12),
    AVATAR_STICKER_METADATA(13),
    AVATAR_STICKER_IMAGE(14),
    BITMOJI_IMAGE(15),
    UNKNOWN_GRPC_FEATURE(16),
    EXPRESSIVE_STICKER_AUTOCOMPLETE(17),
    EXPRESSIVE_STICKER_SEARCH(18),
    AVATAR_STICKER_CREATE(19),
    NATIVE_CARD(20),
    CURATED_IMAGE(21),
    LOCAL(22),
    PLAYSTORE_STICKER_IMAGE(23),
    TENOR_GIF_SEARCH_SUGGESTION_METADATA(24),
    TENOR_TRENDING_SEARCH_TERM_METADATA(25),
    TENOR_AUTOCOMPLETE_METADATA(26),
    TENOR_FEATURED_METADATA(27),
    TENOR_STICKER_SEARCH_METADATA(28),
    TENOR_STATIC_IMAGE(29);
    
    public final int E;

    mbn(int i) {
        this.E = i;
    }

    public static mbn b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SEARCH_FEATURE;
            case 1:
                return STICKER_JSON;
            case 2:
                return GIS_GIF_METADATA;
            case 3:
                return GIS_GIF_THUMBNAIL;
            case 4:
                return GIS_GIF_FULL_IMAGE;
            case 5:
                return TENOR_GIF_SEARCH_METADATA;
            case 6:
                return TENOR_GIF_TRENDING_METADATA;
            case 7:
                return TENOR_GIF_THUMBNAIL;
            case 8:
                return TENOR_GIF_FULL_IMAGE;
            case 9:
                return AUTOCOMPLETE;
            case 10:
                return TENOR_GIF_CATEGORY_METADATA;
            case 11:
                return EXPRESSIVE_STICKER_METADATA;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return EXPRESSIVE_STICKER_IMAGE;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return AVATAR_STICKER_METADATA;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return AVATAR_STICKER_IMAGE;
            case 15:
                return BITMOJI_IMAGE;
            case 16:
                return UNKNOWN_GRPC_FEATURE;
            case 17:
                return EXPRESSIVE_STICKER_AUTOCOMPLETE;
            case 18:
                return EXPRESSIVE_STICKER_SEARCH;
            case 19:
                return AVATAR_STICKER_CREATE;
            case 20:
                return NATIVE_CARD;
            case 21:
                return CURATED_IMAGE;
            case 22:
                return LOCAL;
            case 23:
                return PLAYSTORE_STICKER_IMAGE;
            case 24:
                return TENOR_GIF_SEARCH_SUGGESTION_METADATA;
            case 25:
                return TENOR_TRENDING_SEARCH_TERM_METADATA;
            case 26:
                return TENOR_AUTOCOMPLETE_METADATA;
            case 27:
                return TENOR_FEATURED_METADATA;
            case 28:
                return TENOR_STICKER_SEARCH_METADATA;
            case 29:
                return TENOR_STATIC_IMAGE;
            default:
                return null;
        }
    }

    public static nfq c() {
        return mbm.a;
    }

    @Override // defpackage.nfp
    public final int a() {
        return this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
