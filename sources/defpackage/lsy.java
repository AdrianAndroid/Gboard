package defpackage;

import java.io.Serializable;
import java.util.NavigableMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: lsy  reason: default package */
/* loaded from: classes.dex */
public final class lsy extends ljj implements Serializable {
    final NavigableMap a;
    private transient Set b;

    public lsy(NavigableMap navigableMap) {
        this.a = navigableMap;
    }

    @Override // defpackage.lrj
    public final Set b() {
        Set set = this.b;
        if (set == null) {
            lsx lsxVar = new lsx(this.a.values());
            this.b = lsxVar;
            return lsxVar;
        }
        return set;
    }
}
