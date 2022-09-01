package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Printer;
import com.google.android.libraries.inputmethod.staticflag.AllFlags;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ilk  reason: default package */
/* loaded from: classes.dex */
public final class ilk implements ilc {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule");
    public final Context b;
    public final String c;
    public final ino d;
    public final idk e;
    private final BroadcastReceiver f;
    private final mkr g;
    private final ArrayDeque h = new ArrayDeque();
    private mko i;

    public ilk(Context context) {
        ino K = ino.K(context, "phenotype");
        mks mksVar = gxp.a().b;
        ieh j = ieh.j();
        this.b = context;
        if (!TextUtils.isEmpty(AllFlags.STATICMENDELPACKAGENAME)) {
            String str = AllFlags.STATICMENDELPACKAGENAME;
            String packageName = context.getPackageName();
            this.c = str + "#" + packageName;
            this.d = K;
            this.g = mksVar;
            this.e = j;
            this.f = new ili(this);
            return;
        }
        throw new IllegalStateException("Mendel package name must be set.");
    }

    public static void d(hhl hhlVar, Set set) {
        if (set != null) {
            set.add(hhlVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000b, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:17:0x004e, B:18:0x0071, B:26:0x009c, B:27:0x00a3, B:32:0x00b9, B:35:0x0093, B:36:0x007f, B:39:0x0084, B:41:0x0088, B:28:0x00a4, B:30:0x00b3, B:31:0x00b8, B:19:0x0072, B:20:0x007a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: all -> 0x00f2, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x000b, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:17:0x004e, B:18:0x0071, B:26:0x009c, B:27:0x00a3, B:32:0x00b9, B:35:0x0093, B:36:0x007f, B:39:0x0084, B:41:0x0088, B:28:0x00a4, B:30:0x00b3, B:31:0x00b8, B:19:0x0072, B:20:0x007a), top: B:2:0x0001 }] */
    @Override // defpackage.ilc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.mko c(int r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilk.c(int):mko");
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Last success experiment update time: ".concat(String.valueOf(DateUtils.formatDateTime(this.b, this.d.c("phenotype_last_update_timestamp", 0L), 17))));
        printer.println("Last committed token: ".concat(String.valueOf(this.d.Q("__last_committed_token__"))));
        synchronized (this.h) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                printer.println(((ilj) it.next()).toString());
            }
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "PhenotypeModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "onCreate", 143, "PhenotypeModule.java")).t("onCreate()");
        this.e.e(irk.STATE_REACHED, "keyboard.experiments", 1);
        c(1);
        context.registerReceiver(this.f, new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
    }

    @Override // defpackage.ifw
    public final void gn() {
        this.b.unregisterReceiver(this.f);
        ((ltd) ((ltd) a.b()).k("com/google/android/libraries/inputmethod/phenotype/PhenotypeModule", "onDestroy", 406, "PhenotypeModule.java")).t("onDestroy()");
    }
}
