package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.inputmethod.libs.sharing.GboardSharingSetupDonePage;
import com.google.android.apps.inputmethod.libs.swissarmyknife.DecoderStateReportActivity;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.widgets.LinkableTextView;

/* compiled from: PG */
/* renamed from: bwd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bwd implements jdj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bwd(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ bwd(GboardSharingSetupDonePage gboardSharingSetupDonePage, int i) {
        this.b = i;
        this.a = gboardSharingSetupDonePage;
    }

    public /* synthetic */ bwd(DecoderStateReportActivity decoderStateReportActivity, int i) {
        this.b = i;
        this.a = decoderStateReportActivity;
    }

    public /* synthetic */ bwd(LinkableTextView linkableTextView, int i) {
        this.b = i;
        this.a = linkableTextView;
    }

    public /* synthetic */ bwd(ddk ddkVar, int i) {
        this.b = i;
        this.a = ddkVar;
    }

    public /* synthetic */ bwd(dqg dqgVar, int i) {
        this.b = i;
        this.a = dqgVar;
    }

    public /* synthetic */ bwd(gzm gzmVar, int i) {
        this.b = i;
        this.a = gzmVar;
    }

    @Override // defpackage.jdj
    public final void a(int i) {
        switch (this.b) {
            case 0:
                Object obj = this.a;
                hsk b = hsx.b();
                if (b == null) {
                    return;
                }
                ins insVar = new ins(19);
                insVar.b((Context) obj, R.string.f162360_resource_name_obfuscated_res_0x7f14070d, R.string.f160980_resource_name_obfuscated_res_0x7f140682);
                b.aC(insVar);
                return;
            case 1:
                Object obj2 = this.a;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                intent.setData(Uri.parse("https://support.google.com/gboard/answer/9334583"));
                ((Context) obj2).startActivity(intent);
                return;
            case 2:
                Object obj3 = this.a;
                ieh.j().e(dda.SETUP_WIZARD_SET_LANGUAGES_CLICKED, new Object[0]);
                Context context = ((ddk) obj3).getContext();
                hrx.y(context).j(context, -1, null);
                return;
            case 3:
                Object obj4 = this.a;
                Context context2 = ((dqg) obj4).getContext();
                hrx.y(context2).j(context2, -1, null);
                ((dt) obj4).dismiss();
                return;
            case 4:
                Object obj5 = this.a;
                ieh.j().e(dda.SETUP_WIZARD_SET_LANGUAGES_CLICKED, new Object[0]);
                GboardSharingSetupDonePage gboardSharingSetupDonePage = (GboardSharingSetupDonePage) obj5;
                hrx.y(gboardSharingSetupDonePage.b).j(gboardSharingSetupDonePage.b, -1, null);
                return;
            case 5:
                guc.a.a((Context) this.a, "StateReportIntro");
                return;
            case 6:
                Object obj6 = this.a;
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://policies.google.com/privacy"));
                intent2.setFlags(268435456);
                ((Context) obj6).startActivity(intent2);
                return;
            case 7:
                gzm gzmVar = (gzm) this.a;
                gzm.m(gzmVar.e, gzmVar.c);
                return;
            case 8:
                Object obj7 = this.a;
                hsk b2 = hsx.b();
                if (b2 == null) {
                    return;
                }
                ins insVar2 = new ins(16);
                insVar2.b((Context) obj7, R.string.f162370_resource_name_obfuscated_res_0x7f14070e, R.string.f160890_resource_name_obfuscated_res_0x7f140679);
                b2.aC(insVar2);
                return;
            default:
                jdj jdjVar = ((LinkableTextView) this.a).a;
                if (jdjVar == null) {
                    return;
                }
                jdjVar.a(i);
                return;
        }
    }
}
