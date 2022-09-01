package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* renamed from: gua  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gua implements DialogInterface.OnClickListener {
    private final /* synthetic */ int e;
    public static final /* synthetic */ gua d = new gua(3);
    public static final /* synthetic */ gua c = new gua(2);
    public static final /* synthetic */ gua b = new gua(1);
    public static final /* synthetic */ gua a = new gua(0);

    private /* synthetic */ gua(int i) {
        this.e = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            dialogInterface.dismiss();
        } else if (i2 != 1) {
        } else {
            emf.a(mdt.CANCEL_CLICKED);
        }
    }
}
