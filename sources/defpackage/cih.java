package defpackage;

import j$.util.Collection$EL;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cih  reason: default package */
/* loaded from: classes.dex */
public abstract class cih implements cka {
    @Override // defpackage.cka
    public final lfb a(List list, llp llpVar) {
        return (lfb) Collection$EL.stream(llpVar).map(new cig(this, list, 0)).filter(ccj.c).findFirst().orElse(ldu.a);
    }

    public abstract lfb b(List list, mse mseVar);

    @Override // defpackage.cka
    public final llp c(List list, llp llpVar) {
        return (llp) Collection$EL.stream(llpVar).flatMap(new cig(this, list, 1)).filter(fgy.m(byw.i)).collect(ljr.a);
    }

    public abstract llp d(List list, mse mseVar);
}
