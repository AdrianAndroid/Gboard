package com.caverock.androidsvg;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SVGImageView extends ImageView {
    protected float a;
    protected djc b;

    public SVGImageView(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #0 {all -> 0x00c3, blocks: (B:7:0x0018, B:11:0x0051, B:13:0x0061, B:16:0x007d, B:18:0x0083, B:20:0x0087, B:21:0x0093, B:25:0x00ab, B:28:0x0026, B:30:0x002f, B:32:0x0040), top: B:6:0x0018, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #0 {all -> 0x00c3, blocks: (B:7:0x0018, B:11:0x0051, B:13:0x0061, B:16:0x007d, B:18:0x0083, B:20:0x0087, B:21:0x0093, B:25:0x00ab, B:28:0x0026, B:30:0x002f, B:32:0x0040), top: B:6:0x0018, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(android.util.AttributeSet r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L7
            return
        L7:
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = defpackage.bha.a
            r2 = 0
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1, r7, r2)
            r7 = 2
            r0 = -1
            int r7 = r6.getResourceId(r7, r0)     // Catch: java.lang.Throwable -> Lc3
            r1 = 4
            int r1 = r6.getResourceId(r1, r0)     // Catch: java.lang.Throwable -> Lc3
            if (r7 != r0) goto L26
            if (r1 == r0) goto L51
            r7 = -1
        L26:
            djc r3 = new djc     // Catch: java.lang.Throwable -> Lc3
            r3.<init>()     // Catch: java.lang.Throwable -> Lc3
            r5.b = r3     // Catch: java.lang.Throwable -> Lc3
            if (r7 == r0) goto L3e
            android.content.Context r4 = r5.getContext()     // Catch: java.lang.Throwable -> Lc3
            int r7 = defpackage.us.a(r4, r7)     // Catch: java.lang.Throwable -> Lc3
            bhf r4 = new bhf     // Catch: java.lang.Throwable -> Lc3
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Lc3
            r3.b = r4     // Catch: java.lang.Throwable -> Lc3
        L3e:
            if (r1 == r0) goto L51
            djc r7 = r5.b     // Catch: java.lang.Throwable -> Lc3
            android.content.Context r3 = r5.getContext()     // Catch: java.lang.Throwable -> Lc3
            int r1 = defpackage.us.a(r3, r1)     // Catch: java.lang.Throwable -> Lc3
            bhf r3 = new bhf     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lc3
            r7.a = r3     // Catch: java.lang.Throwable -> Lc3
        L51:
            r7 = 3
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r6.getFloat(r7, r1)     // Catch: java.lang.Throwable -> Lc3
            r5.a = r7     // Catch: java.lang.Throwable -> Lc3
            r7 = 1
            int r1 = r6.getResourceId(r7, r0)     // Catch: java.lang.Throwable -> Lc3
            if (r1 == r0) goto L7d
            bjt r0 = new bjt     // Catch: java.lang.Throwable -> Lc3
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc3
            djc r3 = r5.b     // Catch: java.lang.Throwable -> Lc3
            r0.b = r3     // Catch: java.lang.Throwable -> Lc3
            float r3 = r5.a     // Catch: java.lang.Throwable -> Lc3
            r0.a = r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer[] r7 = new java.lang.Integer[r7]     // Catch: java.lang.Throwable -> Lc3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Lc3
            r7[r2] = r1     // Catch: java.lang.Throwable -> Lc3
            r0.execute(r7)     // Catch: java.lang.Throwable -> Lc3
            r6.recycle()
            return
        L7d:
            java.lang.String r0 = r6.getString(r7)     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lbf
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> Lc3
            android.content.Context r3 = r5.getContext()     // Catch: java.io.FileNotFoundException -> Lab java.lang.Throwable -> Lc3
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.io.FileNotFoundException -> Lab java.lang.Throwable -> Lc3
            java.io.InputStream r0 = r3.openInputStream(r1)     // Catch: java.io.FileNotFoundException -> Lab java.lang.Throwable -> Lc3
            bju r1 = new bju     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lc3
            djc r3 = r5.b     // Catch: java.lang.Throwable -> Lc3
            r1.b = r3     // Catch: java.lang.Throwable -> Lc3
            float r3 = r5.a     // Catch: java.lang.Throwable -> Lc3
            r1.a = r3     // Catch: java.lang.Throwable -> Lc3
            java.io.InputStream[] r7 = new java.io.InputStream[r7]     // Catch: java.lang.Throwable -> Lc3
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lc3
            r1.execute(r7)     // Catch: java.lang.Throwable -> Lc3
            r6.recycle()
            return
        Lab:
            bjs r1 = new bjs     // Catch: java.lang.Throwable -> Lc3
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lc3
            djc r3 = r5.b     // Catch: java.lang.Throwable -> Lc3
            r1.b = r3     // Catch: java.lang.Throwable -> Lc3
            float r3 = r5.a     // Catch: java.lang.Throwable -> Lc3
            r1.a = r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lc3
            r7[r2] = r0     // Catch: java.lang.Throwable -> Lc3
            r1.execute(r7)     // Catch: java.lang.Throwable -> Lc3
        Lbf:
            r6.recycle()
            return
        Lc3:
            r7 = move-exception
            r6.recycle()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGImageView.a(android.util.AttributeSet, int):void");
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i);
    }
}
