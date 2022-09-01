package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fph  reason: default package */
/* loaded from: classes.dex */
public final class fph {
    public final Cfor a;
    public final fmv b;

    public fph(Cfor cfor, fmv fmvVar) {
        this.a = cfor;
        this.b = fmvVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fph)) {
            fph fphVar = (fph) obj;
            if (fyb.aJ(this.a, fphVar.a) && fyb.aJ(this.b, fphVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fyb.aL("key", this.a, arrayList);
        fyb.aL("feature", this.b, arrayList);
        return fyb.aK(arrayList, this);
    }
}
