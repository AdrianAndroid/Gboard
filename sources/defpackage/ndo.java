package defpackage;

/* compiled from: PG */
/* renamed from: ndo  reason: default package */
/* loaded from: classes2.dex */
public enum ndo {
    SIZE("s", 4),
    WIDTH("w", 4),
    CROP("c", 2),
    DOWNLOAD("d", 2),
    HEIGHT("h", 4),
    STRETCH("s", 2),
    HTML("h", 2),
    SMART_CROP("p", 2),
    SMART_CROP_NO_CLIP("pp", 2),
    SMART_CROP_USE_FACE("pf", 2),
    CENTER_CROP("n", 2),
    ROTATE("r", 4),
    SKIP_REFERER_CHECK("r", 2),
    OVERLAY("o", 2),
    OBJECT_ID("o", 1),
    FRAME_ID("j", 1),
    TILE_X("x", 4),
    TILE_Y("y", 4),
    TILE_ZOOM("z", 4),
    TILE_GENERATION("g", 2),
    EXPIRATION_TIME("e", 4),
    IMAGE_FILTER("f", 3),
    KILL_ANIMATION("k", 2),
    UNFILTERED("u", 2),
    UNFILTERED_WITH_TRANSFORMS("ut", 2),
    INCLUDE_METADATA("i", 2),
    ES_PORTRAIT_APPROVED_ONLY("a", 2),
    BYPASS_TAKEDOWN("b", 2),
    BORDER_SIZE("b", 4),
    BORDER_COLOR("c", 7),
    QUERY_STRING("q", 3),
    HORIZONTAL_FLIP("fh", 2),
    VERTICAL_FLIP("fv", 2),
    FORCE_TILE_GENERATION("fg", 2),
    IMAGE_CROP("ci", 2),
    REQUEST_WEBP("rw", 2),
    REQUEST_WEBP_UNLESS_MAYBE_TRANSPARENT("rwu", 2),
    REQUEST_ANIMATED_WEBP("rwa", 2),
    NO_WEBP("nw", 2),
    REQUEST_H264("rh", 2),
    NO_OVERLAY("no", 2),
    NO_SILHOUETTE("ns", 2),
    FOCUS_BLUR("k", 4),
    FOCAL_PLANE("p", 4),
    QUALITY_LEVEL("l", 4),
    QUALITY_BUCKET("v", 4),
    NO_UPSCALE("nu", 2),
    FORCE_TRANSFORMATION("ft", 2),
    CIRCLE_CROP("cc", 2),
    NO_DEFAULT_IMAGE("nd", 2),
    INCLUDE_PUBLIC_METADATA("ip", 2),
    NO_CORRECT_EXIF_ORIENTATION("nc", 2),
    SELECT_FRAME_NUMBER("a", 4),
    REQUEST_JPEG("rj", 2),
    REQUEST_PNG("rp", 2),
    REQUEST_GIF("rg", 2),
    PAD("pd", 2),
    PRESERVE_ASPECT_RATIO("pa", 2),
    VIDEO_FORMAT("m", 4),
    VIDEO_BEGIN("vb", 5),
    VIDEO_LENGTH("vl", 5),
    LOOSE_FACE_CROP("lf", 2),
    MATCH_VERSION("mv", 2),
    IMAGE_DIGEST("id", 2),
    AUTOLOOP("al", 2),
    INTERNAL_CLIENT("ic", 4),
    TILE_PYRAMID_AS_PROTO("pg", 2),
    MONOGRAM("mo", 2),
    VERSIONED_TOKEN("nt0", 3),
    IMAGE_VERSION("iv", 5),
    PITCH_DEGREES("pi", 6),
    YAW_DEGREES("ya", 6),
    ROLL_DEGREES("ro", 6),
    FOV_DEGREES("fo", 6),
    DETECT_FACES("df", 2),
    VIDEO_MULTI_FORMAT("mm", 3),
    STRIP_GOOGLE_DATA("sg", 2),
    PRESERVE_GOOGLE_DATA("gd", 2),
    FORCE_MONOGRAM("fm", 2),
    BADGE("ba", 4),
    BORDER_RADIUS("br", 4),
    BACKGROUND_COLOR("bc", 7),
    PAD_COLOR("pc", 7),
    SUBSTITUTION_COLOR("sc", 7),
    DOWNLOAD_VIDEO("dv", 2),
    MONOGRAM_DOGFOOD("md", 2),
    COLOR_PROFILE("cp", 4),
    STRIP_METADATA("sm", 2),
    FACE_CROP_VERSION("cv", 4),
    STRIP_GEOINFO("ng", 2),
    IGNORE_LOW_RES_PROFILE_PHOTO("il", 2),
    LOSSY("lo", 2),
    VIDEO_MANIFEST("vm", 2),
    DEEP_CROP("dc", 8),
    REQUEST_VIDEO_FAST("rf", 2),
    VIDEO_FORMAT_FILTERS("vf", 3);
    
    public final String aS;
    public final int aT;

    ndo(String str, int i) {
        this.aS = str;
        this.aT = i;
    }
}
