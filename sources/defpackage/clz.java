package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* renamed from: clz  reason: default package */
/* loaded from: classes.dex */
public final class clz implements jtn {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/expression/data/emoji/search/FetchBundledResourceTask");
    private final Context b;
    private final jan c;
    private final String d;
    private final File e;

    public clz(Context context, jan janVar, String str, File file) {
        this.b = context;
        this.c = janVar;
        this.d = str;
        this.e = file;
    }

    private final void b(int i) {
        if (this.d.contains("emoji_superpacks_manifest_bundled.zip")) {
            ieh.j().e(clt.EXTRACT_PREBUNDLED_EMOJI_METADATA, Integer.valueOf(i));
        } else {
            ieh.j().e(clt.EXTRACT_PREBUNDLED_EMOJI_DATA, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0103  */
    /* JADX WARN: Type inference failed for: r14v14, types: [jan] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00fd -> B:7:0x0100). Please submit an issue!!! */
    @Override // defpackage.jtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.jrr r14) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clz.a(jrr):java.lang.Object");
    }
}
