package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterface$Entry;
import com.google.android.apps.inputmethod.libs.hmm.MutableDictionaryAccessorInterfaceImpl;

/* compiled from: PG */
/* renamed from: djq  reason: default package */
/* loaded from: classes.dex */
public final class djq implements gyg {
    private final dij a;
    private dio b;
    private final djp c;

    static {
        lug lugVar = hin.a;
    }

    public djq(dij dijVar, djp djpVar) {
        this.a = dijVar;
        this.c = djpVar;
    }

    @Override // defpackage.gyg
    public final void b() {
        dio dioVar = this.b;
        if (dioVar == null) {
            return;
        }
        dioVar.close();
        this.b = null;
    }

    @Override // defpackage.gyg
    public final void c() {
        dio dioVar = this.b;
        if (dioVar == null) {
            return;
        }
        boolean b = dioVar.b();
        this.b.close();
        this.b = null;
        if (!b) {
            return;
        }
        this.a.I(4);
    }

    @Override // defpackage.gyg
    public final void d(Object[] objArr) {
        if (this.b == null) {
            return;
        }
        MutableDictionaryAccessorInterface$Entry a = this.c.a(gyo.e(objArr), gyo.i(objArr), gyo.m(objArr), gyo.d(objArr));
        if (a == null) {
            return;
        }
        String[] strArr = a.a;
        if (strArr == null) {
            this.b.c(a.c, a.d);
            return;
        }
        MutableDictionaryAccessorInterfaceImpl mutableDictionaryAccessorInterfaceImpl = this.b.a;
        if (mutableDictionaryAccessorInterfaceImpl == null) {
            return;
        }
        mutableDictionaryAccessorInterfaceImpl.nativeInsertOrUpdate(mutableDictionaryAccessorInterfaceImpl.a, strArr, a.b, a.c, a.d, a.e, a.f == 0 && strArr.length > 0);
    }

    @Override // defpackage.gyg
    public final void g() {
        dio dioVar = new dio(this.a, 4);
        this.b = dioVar;
        if (!dioVar.a()) {
            this.b = null;
        }
    }
}
