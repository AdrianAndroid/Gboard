package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ccr  reason: default package */
/* loaded from: classes.dex */
public final class ccr implements gyg {
    private final Context d;
    private final ArrayList b = new ArrayList();
    private int c = 0;
    int a = 0;

    public ccr(Context context) {
        this.d = context;
    }

    @Override // defpackage.gyg
    public final void b() {
        this.b.clear();
    }

    @Override // defpackage.gyg
    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((gyn) arrayList.get(i)).a(this.c, currentTimeMillis);
        }
        Collections.sort(this.b, new kp(9));
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.b.size() && hashSet.size() < 200; i2++) {
            String str = (String) ((gyn) this.b.get(i2)).a;
            if (hashSet.add(str)) {
                arrayList2.add(str);
            }
        }
        int hashCode = arrayList2.hashCode();
        if (hashCode != this.a) {
            cct cctVar = Delight5Facilitator.h(this.d).g;
            if (new ccs(cctVar, arrayList2).b(cctVar.a(), cctVar.b())) {
                ((ltd) ((ltd) cct.a.b()).k("com/google/android/apps/inputmethod/libs/delight5/contacts/ContactsLanguageModelUpdater", "updateLanguageModel", 95, "ContactsLanguageModelUpdater.java")).u("Added %d contacts.", arrayList2.size());
                this.a = hashCode;
            }
            this.b.clear();
            return;
        }
        SystemClock.uptimeMillis();
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        String z = gyk.z(objArr);
        int d = gyk.d(objArr);
        long e = gyk.e(objArr);
        boolean C = gyk.C(objArr);
        if (TextUtils.isEmpty(z) || z.indexOf(64) != -1) {
            return;
        }
        if (z.indexOf(32) == -1 && z.indexOf(45) != -1) {
            return;
        }
        if (d > this.c) {
            this.c = d;
        }
        this.b.add(new gyn(z, d, e, C));
    }

    @Override // defpackage.gyg
    public final void g() {
        this.c = 0;
        this.b.clear();
        System.currentTimeMillis();
    }
}
