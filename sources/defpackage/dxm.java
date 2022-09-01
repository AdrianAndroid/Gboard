package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.inputmethod.libs.framework.keyboard.widget.BidiViewPager;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxm  reason: default package */
/* loaded from: classes.dex */
public final class dxm extends imo {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/onboardingflow/JapaneseLayoutSetupOverlay");
    public static final int[] b = {R.string.f177000_resource_name_obfuscated_res_0x7f140d15, R.string.f176990_resource_name_obfuscated_res_0x7f140d14};
    protected Button e;
    protected Button f;
    public BidiViewPager g;
    public final int[] h;
    public final gqa i;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final hqo j = new dxj(this);

    public dxm(Context context, imn imnVar) {
        super(context, imnVar);
        Throwable th;
        TypedArray typedArray;
        this.i = gqa.a(context);
        try {
            typedArray = context.getResources().obtainTypedArray(R.array.f1510_resource_name_obfuscated_res_0x7f030034);
            try {
                int length = typedArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = typedArray.getResourceId(i, 0);
                }
                if (typedArray != null) {
                    typedArray.recycle();
                }
                this.h = iArr;
            } catch (Throwable th2) {
                th = th2;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = null;
        }
    }

    @Override // defpackage.imo
    public final int a() {
        return R.string.f154460_resource_name_obfuscated_res_0x7f140370;
    }

    @Override // defpackage.imo
    protected final View b(View view) {
        View a2 = this.m.a(R.layout.f135200_resource_name_obfuscated_res_0x7f0e00f3);
        a2.setEnabled(true);
        a2.setOnTouchListener(cnn.c);
        a2.setOnHoverListener(btz.d);
        BidiViewPager bidiViewPager = (BidiViewPager) a2.findViewById(R.id.f56920_resource_name_obfuscated_res_0x7f0b02bb);
        this.g = bidiViewPager;
        bidiViewPager.k(new dxl(this));
        this.g.e(new ecs(this, 1));
        Button button = (Button) a2.findViewById(R.id.f66180_resource_name_obfuscated_res_0x7f0b07d1);
        this.f = button;
        button.setText(R.string.f166510_resource_name_obfuscated_res_0x7f1408e2);
        this.f.setOnClickListener(new dwx(this, 3));
        Button button2 = (Button) a2.findViewById(R.id.f67400_resource_name_obfuscated_res_0x7f0b0859);
        this.e = button2;
        button2.setText(R.string.f158700_resource_name_obfuscated_res_0x7f14056c);
        this.e.setOnClickListener(new dwx(this, 4));
        return a2;
    }

    public final void c(int i) {
        new Handler().postDelayed(new dvd(this, 12), i);
    }

    @Override // defpackage.imo
    public final boolean e() {
        return false;
    }

    public final void f(int i) {
        dwx dwxVar;
        Button button = this.f;
        if (button != null) {
            button.setText(i == 0 ? R.string.f166510_resource_name_obfuscated_res_0x7f1408e2 : R.string.f148300_resource_name_obfuscated_res_0x7f14008e);
            this.f.setOnClickListener(i == 0 ? new dwx(this, 3) : new dwx(this, 5));
        }
        int i2 = R.string.f150380_resource_name_obfuscated_res_0x7f140199;
        if (i == 0 && this.e != null) {
            int i3 = 0;
            int indexOf = ((List) this.c.get(0)).indexOf(this.d.get(0));
            Button button2 = this.e;
            if (indexOf == 0) {
                i2 = R.string.f158700_resource_name_obfuscated_res_0x7f14056c;
            } else {
                i3 = indexOf;
            }
            button2.setText(i2);
            Button button3 = this.e;
            if (i3 == 0) {
                dwxVar = new dwx(this, 4);
            } else {
                dwxVar = new dwx(this, 6);
            }
            button3.setOnClickListener(dwxVar);
            return;
        }
        Button button4 = this.e;
        if (button4 == null) {
            return;
        }
        button4.setText(R.string.f150380_resource_name_obfuscated_res_0x7f140199);
        this.e.setOnClickListener(new dwx(this, 7));
    }

    @Override // defpackage.imo
    protected final boolean k() {
        return false;
    }
}
