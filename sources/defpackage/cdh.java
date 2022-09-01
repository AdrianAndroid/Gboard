package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cdh  reason: default package */
/* loaded from: classes.dex */
public final class cdh implements gyg {
    private final Context a;
    private final List b = new ArrayList();
    private int c = 0;

    public cdh(Context context) {
        this.a = context;
    }

    @Override // defpackage.gyg
    public final void b() {
        this.b.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        for (gyn gynVar : this.b) {
            gynVar.a(this.c, currentTimeMillis);
        }
        Collections.sort(this.b, new kp(9));
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : eju.p(this.a)) {
            if (hashSet.add(str)) {
                eju.q(arrayList, str, 2, true, seconds);
            }
        }
        for (int i = 0; i < this.b.size() && hashSet.size() < 200; i++) {
            String str2 = (String) ((gyn) this.b.get(i)).a;
            if (hashSet.add(str2)) {
                eju.q(arrayList, str2, 1, false, seconds);
            }
        }
        e(arrayList);
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        String i = cdi.i(objArr);
        if (!eju.r(i)) {
            return;
        }
        int d = cdi.d(objArr);
        if (d > this.c) {
            this.c = d;
        }
        this.b.add(new gyn(i, d, cdi.e(objArr), cdi.m(objArr)));
    }

    public final void e(List list) {
        dbf dbfVar = Delight5Facilitator.h(this.a).t;
        if (list.isEmpty()) {
            return;
        }
        new cdj(list).b(dbfVar.c(), dbfVar.d());
    }

    @Override // defpackage.gyg
    public final void g() {
        this.b.clear();
    }
}
