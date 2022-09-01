package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: aok  reason: default package */
/* loaded from: classes.dex */
public final class aok extends aom {
    private final azp e;

    public aok(List list) {
        super(list);
        int i = 0;
        azp azpVar = (azp) ((asi) list.get(0)).b;
        i = azpVar != null ? azpVar.j() : i;
        this.e = new azp(new float[i], new int[i]);
    }

    @Override // defpackage.aoh
    public final /* bridge */ /* synthetic */ Object f(asi asiVar, float f) {
        azp azpVar = this.e;
        azp azpVar2 = (azp) asiVar.b;
        azp azpVar3 = (azp) asiVar.c;
        int length = ((int[]) azpVar2.a).length;
        int length2 = ((int[]) azpVar3.a).length;
        if (length == length2) {
            for (int i = 0; i < ((int[]) azpVar2.a).length; i++) {
                ((float[]) azpVar.b)[i] = asc.c(((float[]) azpVar2.b)[i], ((float[]) azpVar3.b)[i], f);
                ((int[]) azpVar.a)[i] = xm.d(f, ((int[]) azpVar2.a)[i], ((int[]) azpVar3.a)[i]);
            }
            return this.e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + length + " vs " + length2 + ")");
    }
}
