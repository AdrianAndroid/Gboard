package defpackage;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* renamed from: kna  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kna implements AdapterView.OnItemClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kna(iw iwVar, int i) {
        this.b = i;
        this.a = iwVar;
    }

    public /* synthetic */ kna(knb knbVar, int i) {
        this.b = i;
        this.a = knbVar;
    }

    public kna(kyx kyxVar, int i) {
        this.b = i;
        this.a = kyxVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.b;
        if (i2 == 0) {
            Object obj = this.a;
            kmz kmzVar = (kmz) adapterView.getItemAtPosition(i);
            LicenseMenuActivity licenseMenuActivity = ((knb) obj).b;
            if (licenseMenuActivity == null) {
                return;
            }
            Intent intent = new Intent(licenseMenuActivity, LicenseActivity.class);
            intent.putExtra("license", kmzVar);
            licenseMenuActivity.startActivity(intent);
        } else if (i2 == 1) {
            ((iw) this.a).d.setSelection(i);
            if (((iw) this.a).d.getOnItemClickListener() != null) {
                iw iwVar = (iw) this.a;
                iwVar.d.performItemClick(view, i, iwVar.b.getItemId(i));
            }
            ((lg) this.a).k();
        } else {
            View view2 = null;
            if (i < 0) {
                lg lgVar = ((kyx) this.a).a;
                item = !lgVar.u() ? null : lgVar.e.getSelectedItem();
            } else {
                item = ((kyx) this.a).getAdapter().getItem(i);
            }
            ((kyx) this.a).c(item);
            AdapterView.OnItemClickListener onItemClickListener = ((kyx) this.a).getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    lg lgVar2 = ((kyx) this.a).a;
                    if (lgVar2.u()) {
                        view2 = lgVar2.e.getSelectedView();
                    }
                    view = view2;
                    i = ((kyx) this.a).a.o();
                    lg lgVar3 = ((kyx) this.a).a;
                    j = !lgVar3.u() ? Long.MIN_VALUE : lgVar3.e.getSelectedItemId();
                }
                onItemClickListener.onItemClick(((kyx) this.a).a.e, view, i, j);
            }
            ((kyx) this.a).a.k();
        }
    }
}
