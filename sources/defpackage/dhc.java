package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dhc  reason: default package */
/* loaded from: classes.dex */
public final class dhc {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/recognition/SegmentationUtil");

    public static int[] a(gpm gpmVar, gpq gpqVar) {
        if (gpmVar.a() == 0) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/handwriting/recognition/SegmentationUtil", "getStrokeMonotonousSegmentation", 39, "SegmentationUtil.java")).t("getStrokeMonotonousSegmentation(): No result, cannot create segmentation.");
            return new int[0];
        }
        String str = gpmVar.b(0).a;
        int[] iArr = new int[str.codePointCount(0, str.length())];
        if (!gpmVar.b.isEmpty()) {
            gpl gplVar = (gpl) gpmVar.b.get(0);
            if (gplVar.a() == str.codePointCount(0, str.length())) {
                int i = -1;
                for (int i2 = 0; i2 < gplVar.a(); i2++) {
                    gpk gpkVar = gplVar.a[i2];
                    if (gpkVar.a() == 1) {
                        gpj gpjVar = gpkVar.b[0];
                        if (gpjVar.b == 0 && gpjVar.a == i + 1) {
                            int size = gpqVar.size();
                            int i3 = gpjVar.c;
                            if (size > i3 && gpjVar.d == ((gpp) gpqVar.get(i3)).a() - 1) {
                                i = gpjVar.c;
                                iArr[i2] = i + 1;
                            }
                        }
                        int i4 = gpjVar.b;
                        int i5 = gpjVar.a;
                        int i6 = gpjVar.d;
                        gpqVar.size();
                        int size2 = gpqVar.size();
                        int i7 = gpjVar.c;
                        if (size2 > i7) {
                            ((gpp) gpqVar.get(i7)).a();
                        }
                    } else {
                        gpkVar.a();
                    }
                }
                Arrays.toString(iArr);
                return iArr;
            }
            gplVar.a();
            gpmVar.b(0).a.length();
            String str2 = gpmVar.b(0).a;
        }
        Arrays.fill(iArr, -1);
        iArr[0] = gpqVar.size();
        Arrays.toString(iArr);
        return iArr;
    }
}
