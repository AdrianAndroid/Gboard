package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: bty  reason: default package */
/* loaded from: classes.dex */
public final class bty implements Iterator, j$.util.Iterator {
    private final djh a;
    private final Iterator b;
    private final List c = lre.F();
    private final hlk d = hln.a();

    public bty(Iterator it, djh djhVar) {
        this.a = djhVar;
        this.b = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    public final hln next() {
        hln next = ((diw) this.b).next();
        Object obj = next.j;
        if (obj == null) {
            return next;
        }
        int intValue = ((Integer) obj).intValue();
        djh djhVar = this.a;
        List list = this.c;
        list.clear();
        dik dikVar = (dik) djhVar;
        int c = dikVar.m.c(intValue);
        for (int i = 0; i < c; i++) {
            dje djeVar = new dje();
            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar.m;
            dik.J(hmmEngineInterfaceImpl, hmmEngineInterfaceImpl.j(intValue, i), false, djeVar);
            list.add(djeVar);
        }
        CharSequence charSequence = next.a;
        String a = charSequence == null ? null : btu.a(charSequence.toString(), this.c);
        if (a == null) {
            return next;
        }
        CharSequence charSequence2 = next.a;
        if (charSequence2 != null && a.equals(charSequence2.toString())) {
            return next;
        }
        hlk hlkVar = this.d;
        hlkVar.b(next);
        hlkVar.a = a;
        return hlkVar.a();
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
    }
}
