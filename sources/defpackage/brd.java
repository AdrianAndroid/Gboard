package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: brd  reason: default package */
/* loaded from: classes.dex */
public final class brd implements idm {
    public final Context a;
    public final ino b;
    public final ArrayList c;
    private final idb d = new bre(this);

    public brd(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = context;
        this.b = ino.M(context);
        Collections.addAll(arrayList, strArr);
    }

    public static boolean a(Context context) {
        return ino.M(context).al("new_rlz_ping_sent", false, false);
    }

    @Override // defpackage.idj
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.idj
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.d.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return bre.a;
    }
}
