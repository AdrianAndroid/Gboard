package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dwp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dwp implements hld {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dwp(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    public /* synthetic */ dwp(cjt cjtVar, int i) {
        this.b = i;
        this.a = cjtVar;
    }

    public /* synthetic */ dwp(ehp ehpVar, int i) {
        this.b = i;
        this.a = ehpVar;
    }

    public /* synthetic */ dwp(eis eisVar, int i) {
        this.b = i;
        this.a = eisVar;
    }

    @Override // defpackage.hld
    public final hlc a(View view) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return hlc.a(19, 0, ((cjt) this.a).h);
            }
            if (i == 2) {
                Context context = (Context) this.a;
                return hlc.a(530, context.getResources().getDimensionPixelOffset(R.dimen.f41260_resource_name_obfuscated_res_0x7f0705ae), context.getResources().getDimensionPixelOffset(R.dimen.f41270_resource_name_obfuscated_res_0x7f0705af));
            } else if (i == 3) {
                Context context2 = (Context) this.a;
                return hlc.a(537, context2.getResources().getDimensionPixelOffset(R.dimen.f41280_resource_name_obfuscated_res_0x7f0705b0), context2.getResources().getDimensionPixelOffset(R.dimen.f41290_resource_name_obfuscated_res_0x7f0705b1));
            } else if (i == 4) {
                return hlc.a(19, 0, -((ehp) this.a).b.getResources().getDimensionPixelSize(R.dimen.f34240_resource_name_obfuscated_res_0x7f070191));
            } else {
                return hlc.a(19, 0, -((eis) this.a).b.getResources().getDimensionPixelSize(R.dimen.f34240_resource_name_obfuscated_res_0x7f070191));
            }
        }
        return hlc.a(594, 0, ((Context) this.a).getResources().getDimensionPixelOffset(R.dimen.f41050_resource_name_obfuscated_res_0x7f070597));
    }
}
