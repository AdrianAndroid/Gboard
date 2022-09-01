package defpackage;

import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: kd  reason: default package */
/* loaded from: classes.dex */
public final class kd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Insets a(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    public static Path b(String str) {
        Path path = new Path();
        vt[] d = d(str);
        if (d != null) {
            try {
                vt.a(d, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public static boolean c(vt[] vtVarArr, vt[] vtVarArr2) {
        if (vtVarArr == null || vtVarArr2 == null || vtVarArr.length != vtVarArr2.length) {
            return false;
        }
        for (int i = 0; i < vtVarArr.length; i++) {
            vt vtVar = vtVarArr[i];
            char c = vtVar.a;
            vt vtVar2 = vtVarArr2[i];
            if (c != vtVar2.a || vtVar.b.length != vtVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: NumberFormatException -> 0x00bb, LOOP:3: B:29:0x006e->B:39:0x0099, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bb, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0099, B:42:0x009f, B:47:0x00b0, B:60:0x00b4), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: NumberFormatException -> 0x00bb, TryCatch #0 {NumberFormatException -> 0x00bb, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0099, B:42:0x009f, B:47:0x00b0, B:60:0x00b4), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[Catch: NumberFormatException -> 0x00bb, TryCatch #0 {NumberFormatException -> 0x00bb, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0099, B:42:0x009f, B:47:0x00b0, B:60:0x00b4), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.vt[] d(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd.d(java.lang.String):vt[]");
    }

    public static vt[] e(vt[] vtVarArr) {
        if (vtVarArr == null) {
            return null;
        }
        vt[] vtVarArr2 = new vt[vtVarArr.length];
        for (int i = 0; i < vtVarArr.length; i++) {
            vtVarArr2[i] = new vt(vtVarArr[i]);
        }
        return vtVarArr2;
    }

    private static void g(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new vt(c, fArr));
    }

    public static float[] f(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int min = Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }
}
