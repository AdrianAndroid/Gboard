package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.ImageView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ekp  reason: default package */
/* loaded from: classes.dex */
public final class ekp extends mo {
    public final lfb A;
    public final ImageView.ScaleType B;
    public final /* synthetic */ ekt C;
    private final View.OnClickListener D;
    public final cha s;
    public final AppCompatTextView t;
    public final View u;
    public final View v;
    public final ekr w;
    public final CharSequence x;
    public final CharSequence y;
    public cqp z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekp(ekt ektVar, View view) {
        super(view);
        this.C = ektVar;
        cha chaVar = (cha) view.findViewById(R.id.f52400_resource_name_obfuscated_res_0x7f0b0080);
        this.s = chaVar;
        this.u = view.findViewById(R.id.f56420_resource_name_obfuscated_res_0x7f0b0280);
        this.t = (AppCompatTextView) view.findViewById(R.id.f56440_resource_name_obfuscated_res_0x7f0b0282);
        View.OnClickListener edcVar = new edc(this, 6);
        edcVar = ektVar.ad ? new dbg(edcVar, 0) : edcVar;
        this.D = edcVar;
        View findViewById = view.findViewById(R.id.f56430_resource_name_obfuscated_res_0x7f0b0281);
        this.v = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(edcVar);
        }
        CharSequence contentDescription = chaVar.getContentDescription();
        this.x = contentDescription;
        this.w = new ekr(this, ektVar.V);
        this.B = chaVar.a();
        lfb f = lfb.f((AppCompatTextView) view.findViewById(R.id.f52390_resource_name_obfuscated_res_0x7f0b007f));
        this.A = f;
        this.y = f.e() ? String.format("%s (%s)", contentDescription, ((AppCompatTextView) f.a()).getContentDescription()) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F() {
        this.z.d();
        if (this.s.g()) {
            G();
            return;
        }
        this.C.aG(this.z);
        ekt ektVar = this.C;
        ekq ekqVar = ektVar.aa;
        if (ekqVar == null) {
            return;
        }
        ektVar.l.ha();
        ekqVar.a();
    }

    public final void G() {
        this.s.setOnClickListener(this.D);
    }
}
