package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ljl  reason: default package */
/* loaded from: classes.dex */
public class ljl extends ljc implements lrv {
    private static final long serialVersionUID = 7431625294878419160L;

    /* JADX INFO: Access modifiers changed from: protected */
    public ljl(Map map) {
        super(map);
    }

    @Override // defpackage.ljc, defpackage.lqr
    /* renamed from: F */
    public final Set b(Object obj) {
        return (Set) super.b(obj);
    }

    @Override // defpackage.ljc
    public /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // defpackage.ljc
    public final Collection c(Object obj, Collection collection) {
        return new ljb(this, obj, (Set) collection);
    }

    @Override // defpackage.ljh, defpackage.lqr
    /* renamed from: d */
    public final Set x() {
        return (Set) super.x();
    }
}
