package defpackage;

import android.app.Dialog;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.text.method.ScrollingMovementMethod;
import com.google.android.apps.inputmethod.libs.sharing.SharingLinkReceiveActivity;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;
import java.util.List;

/* compiled from: PG */
/* renamed from: emc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class emc implements gzl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ emc(SharingLinkReceiveActivity sharingLinkReceiveActivity, int i) {
        this.b = i;
        this.a = sharingLinkReceiveActivity;
    }

    public /* synthetic */ emc(emf emfVar, int i) {
        this.b = i;
        this.a = emfVar;
    }

    @Override // defpackage.gzl
    public final void a(List list, int i) {
        if (this.b == 0) {
            Object obj = this.a;
            ((emf) obj).b((Dialog) obj, list, i, false);
            return;
        }
        Object obj2 = this.a;
        ieh.j().e(emm.SHARING_LINK_LANGUAGE_RECEIVED, mdu.ENABLE_PAGE, list, Integer.valueOf(i));
        SharingLinkReceiveActivity sharingLinkReceiveActivity = (SharingLinkReceiveActivity) obj2;
        llp k = sharingLinkReceiveActivity.k.k(list);
        if (!k.isEmpty()) {
            ieh.j().e(emm.SHARING_LINK_RECEIVING_USAGE, mdu.ENABLE_PAGE, mdt.ENABLE_SHOWN);
            ely elyVar = new ely(k);
            cx cxVar = (cx) obj2;
            els.g((RecyclerView) cxVar.findViewById(R.id.f55720_resource_name_obfuscated_res_0x7f0b022a), elyVar);
            sharingLinkReceiveActivity.k.o((LinkableTextView) cxVar.findViewById(R.id.f55750_resource_name_obfuscated_res_0x7f0b022d));
            cxVar.findViewById(R.id.f55740_resource_name_obfuscated_res_0x7f0b022c).setOnClickListener(new eiz(sharingLinkReceiveActivity, elyVar, 15));
            return;
        }
        SharingLinkReceiveActivity.l(mdy.ENTRYPOINT_SHOWN);
        cx cxVar2 = (cx) obj2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) cxVar2.findViewById(R.id.f55810_resource_name_obfuscated_res_0x7f0b0233);
        appCompatTextView.setText(sharingLinkReceiveActivity.k.c(list, R.string.f166170_resource_name_obfuscated_res_0x7f1408bd, R.string.f166180_resource_name_obfuscated_res_0x7f1408be, R.string.f166190_resource_name_obfuscated_res_0x7f1408bf));
        appCompatTextView.setMovementMethod(ScrollingMovementMethod.getInstance());
        cxVar2.findViewById(R.id.f55790_resource_name_obfuscated_res_0x7f0b0231).setVisibility(0);
        cxVar2.findViewById(R.id.f55680_resource_name_obfuscated_res_0x7f0b0226).setVisibility(8);
        cxVar2.findViewById(R.id.f55850_resource_name_obfuscated_res_0x7f0b0237).setOnClickListener(new edc(sharingLinkReceiveActivity, 8));
        cxVar2.findViewById(R.id.f55860_resource_name_obfuscated_res_0x7f0b0238).setOnClickListener(new edc(sharingLinkReceiveActivity, 9));
    }
}
