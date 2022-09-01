package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: ahr  reason: default package */
/* loaded from: classes.dex */
final class ahr implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ ahs a;

    public ahr(ahs ahsVar) {
        this.a = ahsVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        ahs ahsVar = this.a;
        if (z) {
            ahsVar.ad = ahsVar.ac.add(ahsVar.af[i].toString()) | ahsVar.ad;
            return;
        }
        ahsVar.ad = ahsVar.ac.remove(ahsVar.af[i].toString()) | ahsVar.ad;
    }
}
