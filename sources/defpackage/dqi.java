package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dqi  reason: default package */
/* loaded from: classes.dex */
public final class dqi extends gzm {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/migration/MigrationHelper");
    public dqg b;

    public dqi(Context context) {
        super(context, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        dqg dqgVar = this.b;
        if (dqgVar != null) {
            dqgVar.dismiss();
            this.b = null;
        }
    }

    @Override // defpackage.gzm
    public final void b(Collection collection, int i) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(hqr.b());
        super.b(arrayList, 5);
    }

    public final void c(Window window, IBinder iBinder, boolean z) {
        String Q = ino.M(this.c).Q("migration_info");
        kcu.U(l(Q), new dqh(this, gzp.a(Q), z, window, iBinder), gyc.b);
    }
}
