package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ixt  reason: default package */
/* loaded from: classes.dex */
public final class ixt implements ixp {
    private ixs a;

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        ixs ixsVar = this.a;
        if (ixsVar != null) {
            llw b = ixsVar.b();
            lmn d = this.a.d();
            llw c = this.a.c();
            printer.println("Trainer config status:");
            lsz it = b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                printer.println(String.format("Trainer: %s, isEnabled: %b, population: %s, status: %s", entry.getKey(), Boolean.valueOf(((ixn) entry.getValue()).e()), ((ixn) entry.getValue()).a().e, c.get(entry.getKey())));
            }
            printer.println("Pending queue:");
            lsz it2 = d.u().iterator();
            while (it2.hasNext()) {
                iiy iiyVar = (iiy) it2.next();
                String iiyVar2 = iiyVar.toString();
                String valueOf = String.valueOf(d.a(iiyVar));
                printer.println(iiyVar2 + ": " + valueOf);
            }
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TrainerManagerModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        ixs ixsVar = new ixs(context, gxo.c(19));
        this.a = ixsVar;
        ixsVar.g();
    }

    @Override // defpackage.ifw
    public final void gn() {
        ixs ixsVar = this.a;
        if (ixsVar != null) {
            ixsVar.close();
            this.a = null;
        }
    }
}
