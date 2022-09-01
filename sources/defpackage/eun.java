package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: eun  reason: default package */
/* loaded from: classes.dex */
public abstract class eun extends ls {
    private final List d = new ArrayList();
    public final List f = new ArrayList();
    public final List g = new ArrayList();

    public final void A(String str, euf eufVar, eum eumVar) {
        int ha = ha();
        this.d.add(str);
        this.f.add(eufVar);
        this.g.add(eumVar);
        hi(ha);
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.d.size();
    }

    public final euf x(int i) {
        return (euf) this.f.get(i);
    }

    public final String y(int i) {
        return (String) this.d.get(i);
    }

    public final List z() {
        return Collections.unmodifiableList(this.f);
    }
}
