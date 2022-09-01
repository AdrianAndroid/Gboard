package defpackage;

/* compiled from: PG */
/* renamed from: hbx  reason: default package */
/* loaded from: classes.dex */
public final class hbx {
    public boolean a;
    public int b;
    public short c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public final hby a() {
        if (this.c != 8191) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" rows");
            }
            if ((this.c & 2) == 0) {
                sb.append(" rowHeight");
            }
            if ((this.c & 4) == 0) {
                sb.append(" maxRecentCount");
            }
            if ((this.c & 8) == 0) {
                sb.append(" poolSize");
            }
            if ((this.c & 16) == 0) {
                sb.append(" columns");
            }
            if ((this.c & 32) == 0) {
                sb.append(" minRowsPerCategory");
            }
            if ((this.c & 64) == 0) {
                sb.append(" emojiIconBackground");
            }
            if ((this.c & 128) == 0) {
                sb.append(" hideCategoryTitle");
            }
            if ((this.c & 256) == 0) {
                sb.append(" displayEmojiVariants");
            }
            if ((this.c & 512) == 0) {
                sb.append(" emojiPlaceHolderDrawable");
            }
            if ((this.c & 1024) == 0) {
                sb.append(" customEmojiTypeface");
            }
            if ((this.c & 2048) == 0) {
                sb.append(" popupWindowFocusable");
            }
            if ((this.c & 4096) == 0) {
                sb.append(" categoryIconMinWidth");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new hby(this.d, this.e, this.f, this.g, this.h, this.i, this.a, this.b);
    }

    public final void b(int i) {
        this.h = i;
        this.c = (short) (this.c | 16);
    }

    public final void c(int i) {
        this.f = i;
        this.c = (short) (this.c | 4);
    }

    public final void d() {
        this.i = 1;
        this.c = (short) (this.c | 32);
    }

    public final void e(int i) {
        this.g = i;
        this.c = (short) (this.c | 8);
    }

    public final void f(int i) {
        this.e = i;
        this.c = (short) (this.c | 2);
    }

    public final void g(float f) {
        this.d = f;
        this.c = (short) (this.c | 1);
    }
}
