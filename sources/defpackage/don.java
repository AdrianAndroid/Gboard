package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: don  reason: default package */
/* loaded from: classes.dex */
public final class don extends hrh {
    private static final lug d = lug.i("LatinImeEntryActivation");
    private final Context e;

    public don(Context context) {
        super(gxo.a(2));
        this.e = context;
    }

    private static boolean d(Context context, List list) {
        qq qqVar = new qq();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qqVar.add(((hqt) it.next()).h().n);
        }
        ino M = ino.M(context);
        Set S = M.S("previously_enabled_entries");
        if (qqVar.equals(S)) {
            return false;
        }
        ((luc) ((luc) d.b()).k("com/google/android/apps/inputmethod/libs/latin5/LatinImeActivationContentObserver", "activeLanguagesHaveChanged", 72, "LatinImeActivationContentObserver.java")).G("Active entries changed: %s -> %s", S, qqVar);
        M.k("previously_enabled_entries", qqVar);
        return true;
    }

    protected final cby a() {
        return cby.a(this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hrh
    public final void b(List list) {
        if (d(this.e, list)) {
            a().d();
            a().e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hrh
    public final void c(List list) {
        if (d(this.e, list)) {
            a().d();
        }
    }
}
