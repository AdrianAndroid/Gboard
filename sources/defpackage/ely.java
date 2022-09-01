package defpackage;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: ely  reason: default package */
/* loaded from: classes.dex */
public final class ely extends ls {
    public final qq d;
    private final llp e;
    private final boolean f;

    public ely(llp llpVar) {
        this(llpVar, false);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ mo d(ViewGroup viewGroup, int i) {
        return new hcr(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f142760_resource_name_obfuscated_res_0x7f0e041c, viewGroup, false));
    }

    @Override // defpackage.ls
    public final int ha() {
        return this.e.size() + (this.f ? 1 : 0);
    }

    @Override // defpackage.ls
    public final /* bridge */ /* synthetic */ void o(mo moVar, int i) {
        CheckBox checkBox = (CheckBox) ((hcr) moVar).s;
        checkBox.setOnCheckedChangeListener(null);
        if (i < this.e.size()) {
            final hqt hqtVar = (hqt) this.e.get(i);
            checkBox.setChecked(this.d.contains(hqtVar));
            checkBox.setText(hqtVar.n(0));
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: elw
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ely elyVar = ely.this;
                    hqt hqtVar2 = hqtVar;
                    qq qqVar = elyVar.d;
                    if (z) {
                        qqVar.add(hqtVar2);
                    } else {
                        qqVar.remove(hqtVar2);
                    }
                }
            });
            return;
        }
        checkBox.setText(Html.fromHtml(checkBox.getContext().getString(R.string.f152880_resource_name_obfuscated_res_0x7f1402ab)).toString());
        checkBox.setButtonDrawable(R.drawable.f47130_resource_name_obfuscated_res_0x7f0801b7);
        checkBox.setOnCheckedChangeListener(elx.a);
    }

    public final lmz x() {
        return lmz.p(this.d);
    }

    public ely(llp llpVar, boolean z) {
        qq qqVar = new qq();
        this.d = qqVar;
        this.e = llpVar;
        qqVar.addAll(llpVar);
        this.f = z;
    }
}
