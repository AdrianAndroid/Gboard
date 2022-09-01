package defpackage;

/* compiled from: PG */
/* renamed from: ean  reason: default package */
/* loaded from: classes.dex */
public final class ean {
    public static final hhl a;
    public static final hhl b;
    public static final hhl c;
    public static final hhl d;
    public static final hhl e = hhq.f("contextual_emoji_suggestion_num", 9);
    public static final llp f;
    public final int g;
    private final boolean h;

    static {
        hhl f2 = hhq.f("emojipickerv2_columns", 9L);
        a = f2;
        hhl a2 = hhq.a("enable_m2_emoji_horizontal_scroll", false);
        b = a2;
        hhl a3 = hhq.a("enable_contextual_emoji_suggestion", false);
        c = a3;
        hhl h = hhq.h("contextual_emoji_suggestion_enabled_languages", "");
        d = h;
        f = llp.w(f2, a2, cvb.b, a3, h, cvb.i, cvb.h);
    }

    public ean() {
    }

    public ean(int i, boolean z) {
        this.g = i;
        this.h = z;
    }

    public static ean a() {
        int intValue = ((Long) a.c()).intValue();
        eam eamVar = new eam();
        eamVar.b(9);
        eamVar.a(false);
        if (intValue == 0) {
            intValue = 9;
        }
        eamVar.b(intValue);
        eamVar.a(((Boolean) b.c()).booleanValue());
        if (eamVar.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((eamVar.c & 1) == 0) {
                sb.append(" v2Columns");
            }
            if ((eamVar.c & 2) == 0) {
                sb.append(" horizontalScroll");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ean(eamVar.a, eamVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ean) {
            ean eanVar = (ean) obj;
            if (this.g == eanVar.g && this.h == eanVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g ^ 1000003) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.g;
        boolean z = this.h;
        return "EmojiLayoutFlags{v2Columns=" + i + ", horizontalScroll=" + z + "}";
    }
}
