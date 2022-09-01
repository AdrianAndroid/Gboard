package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: oml  reason: default package */
/* loaded from: classes2.dex */
public final class oml implements omi {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public oml(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    public oml(oku okuVar, int i) {
        this.b = i;
        this.a = okuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oku, java.lang.Object] */
    @Override // defpackage.omi
    public final Iterator a() {
        ojv ojyVar;
        if (this.b == 0) {
            ?? r0 = this.a;
            omj omjVar = new omj();
            if (!(r0 instanceof ojz)) {
                ojyVar = new ojy(omjVar, r0, omjVar);
            } else {
                ojyVar = ((ojz) r0).c(omjVar, omjVar);
            }
            omjVar.a = ojyVar;
            return omjVar;
        }
        return new lvd((ViewGroup) this.a, 1);
    }
}
