package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lmn  reason: default package */
/* loaded from: classes.dex */
public abstract class lmn extends ljn implements Serializable {
    private static final long serialVersionUID = 0;
    final transient llw map;
    public final transient int size;

    public lmn(llw llwVar, int i) {
        this.map = llwVar;
        this.size = i;
    }

    public static lmh s() {
        return new lmh();
    }

    @Override // defpackage.ljh, defpackage.lqr
    public final /* bridge */ /* synthetic */ Set A() {
        throw null;
    }

    @Override // defpackage.ljh
    public final boolean C(Object obj) {
        return obj != null && super.C(obj);
    }

    @Override // defpackage.ljh, defpackage.lqr
    @Deprecated
    public final boolean E(Object obj, Object obj2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lsz F() {
        return new lmf(this);
    }

    public abstract llg a(Object obj);

    @Override // defpackage.lqr
    public /* bridge */ /* synthetic */ Collection b(Object obj) {
        throw null;
    }

    @Override // defpackage.lqr
    public final int e() {
        return this.size;
    }

    @Override // defpackage.ljh
    public final /* bridge */ /* synthetic */ lqx f() {
        return new lmk(this);
    }

    @Override // defpackage.ljh
    public final /* bridge */ /* synthetic */ Collection h() {
        return new lmi(this);
    }

    @Override // defpackage.ljh
    public final /* bridge */ /* synthetic */ Collection i() {
        return new lmm(this);
    }

    @Override // defpackage.ljh
    public final /* bridge */ /* synthetic */ Iterator j() {
        throw null;
    }

    @Override // defpackage.ljh
    public final Map m() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ljh
    public final Set n() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.lqr
    @Deprecated
    public final void o() {
        throw null;
    }

    public final llg p() {
        return (llg) super.x();
    }

    @Override // defpackage.lqr
    public final boolean q(Object obj) {
        throw null;
    }

    public final llg r() {
        return (llg) super.y();
    }

    public final lmr t() {
        return (lmr) super.w();
    }

    public final lmz u() {
        return this.map.keySet();
    }

    @Override // defpackage.ljh, defpackage.lqr
    @Deprecated
    public final void v(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ljh, defpackage.lqr
    public /* bridge */ /* synthetic */ Collection x() {
        throw null;
    }

    @Override // defpackage.ljh, defpackage.lqr
    public final /* synthetic */ Map z() {
        return this.map;
    }
}
