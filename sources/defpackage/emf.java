package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.List;

/* compiled from: PG */
/* renamed from: emf  reason: default package */
/* loaded from: classes.dex */
public final class emf extends jct {
    public final els a;
    public ely b;
    public guh c;
    private final boolean d;
    private final IBinder e;
    private final int f;

    public emf(Context context, IBinder iBinder, int i) {
        super(context);
        boolean a = gul.a();
        this.d = a;
        this.e = iBinder;
        this.a = new els(context);
        this.f = i;
        if (a) {
            eme emeVar = new eme(this);
            this.c = emeVar;
            emeVar.e();
        }
    }

    public static void a(mdt mdtVar) {
        ieh.j().e(emm.SHARING_LINK_RECEIVING_USAGE, mdu.ENABLE_DIALOG, mdtVar);
    }

    public final void b(Dialog dialog, List list, int i, boolean z) {
        ieh.j().e(emm.SHARING_LINK_LANGUAGE_RECEIVED, mdu.ENABLE_DIALOG, list, Integer.valueOf(i));
        ely elyVar = new ely(this.a.k(list), z);
        this.b = elyVar;
        a(mdt.ENABLE_SHOWN);
        els.g((RecyclerView) dialog.findViewById(R.id.f55720_resource_name_obfuscated_res_0x7f0b022a), elyVar);
        LinkableTextView linkableTextView = (LinkableTextView) dialog.findViewById(R.id.f55750_resource_name_obfuscated_res_0x7f0b022d);
        if (linkableTextView != null) {
            this.a.o(linkableTextView);
        }
        View findViewById = dialog.findViewById(R.id.f55740_resource_name_obfuscated_res_0x7f0b022c);
        if (findViewById != null) {
            findViewById.setOnClickListener(new eiz(this, elyVar, 17));
        }
        View findViewById2 = dialog.findViewById(R.id.f55730_resource_name_obfuscated_res_0x7f0b022b);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new edc(this, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jct, defpackage.dt, defpackage.ox, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.f134800_resource_name_obfuscated_res_0x7f0e00c6);
        double width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
        Double.isNaN(width);
        ((AppCompatTextView) findViewById(R.id.f55700_resource_name_obfuscated_res_0x7f0b0228)).setMaxWidth((int) (width * 0.78d));
        this.a.e(new emc(this, 0));
        gzm.n(getWindow(), this.e, this.f);
    }

    @Override // defpackage.jct, android.app.Dialog
    public final void show() {
        if (this.d) {
            guc.a.a(getContext(), "SharingLinkReceiveDialog");
        } else {
            super.show();
        }
    }
}
