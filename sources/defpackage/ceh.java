package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: ceh  reason: default package */
/* loaded from: classes.dex */
public final class ceh implements cbh {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightDataFileManagerLanguageModelProvider");
    public final Context a;
    private final String c;
    private final Delight5Facilitator d;

    public ceh(Context context, String str) {
        this.a = context;
        this.c = str;
        this.d = Delight5Facilitator.h(context);
    }

    private final void d() {
        try {
            mio.g(cfd.b(this.a).e(false), new byi(this, 3), mjl.a).get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightDataFileManagerLanguageModelProvider", "initializeDataFileManager", (char) 182, "DelightDataFileManagerLanguageModelProvider.java")).t("error getting delight packs");
        }
        try {
            mio.g(cfd.b(this.a).e(true), new byi(this, 4), mjl.a).get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e2)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightDataFileManagerLanguageModelProvider", "initializeDataFileManager", (char) 195, "DelightDataFileManagerLanguageModelProvider.java")).t("error getting bundle delight packs");
        }
        try {
            mio.g(cfd.b(this.a).d(), new byi(this, 5), mjl.a).get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            ((ltd) ((ltd) ((ltd) b.c()).i(e3)).k("com/google/android/apps/inputmethod/libs/delight5/superpacks/DelightDataFileManagerLanguageModelProvider", "initializeDataFileManager", (char) 208, "DelightDataFileManagerLanguageModelProvider.java")).t("error getting override delight packs");
        }
    }

    private static boolean e(gzf gzfVar) {
        return new File(gzfVar.d).exists();
    }

    @Override // defpackage.cbh
    public final String a() {
        List b2 = gzc.b.b("delight");
        StringBuilder sb = new StringBuilder();
        lta listIterator = ((llp) b2).listIterator();
        while (listIterator.hasNext()) {
            sb.append(((gzf) listIterator.next()).c);
        }
        return sb.toString();
    }

    @Override // defpackage.cbh
    public final String b() {
        List b2 = gzc.b.b("bundled_delight");
        StringBuilder sb = new StringBuilder();
        lta listIterator = ((llp) b2).listIterator();
        while (listIterator.hasNext()) {
            sb.append(((gzf) listIterator.next()).c);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (e(r12) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    @Override // defpackage.cbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(java.util.List r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceh.c(java.util.List, boolean):java.util.List");
    }
}
