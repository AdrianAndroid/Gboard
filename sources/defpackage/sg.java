package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: sg  reason: default package */
/* loaded from: classes2.dex */
public class sg extends rz {
    public ArrayList aI = new ArrayList();

    @Override // defpackage.rz
    public final void S(gkn gknVar) {
        super.S(gknVar);
        int size = this.aI.size();
        for (int i = 0; i < size; i++) {
            ((rz) this.aI.get(i)).S(gknVar);
        }
    }

    public void T() {
        ArrayList arrayList = this.aI;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rz rzVar = (rz) this.aI.get(i);
            if (rzVar instanceof sg) {
                ((sg) rzVar).T();
            }
        }
    }

    public final void Y(rz rzVar) {
        this.aI.remove(rzVar);
        rzVar.s();
    }

    @Override // defpackage.rz
    public void s() {
        this.aI.clear();
        super.s();
    }
}
