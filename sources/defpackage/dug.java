package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: dug  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dug implements Consumer {
    private final /* synthetic */ int g;
    public static final /* synthetic */ dug f = new dug(5);
    public static final /* synthetic */ dug e = new dug(4);
    public static final /* synthetic */ dug d = new dug(3);
    public static final /* synthetic */ dug c = new dug(2);
    public static final /* synthetic */ dug b = new dug(1);
    public static final /* synthetic */ dug a = new dug(0);

    public /* synthetic */ dug(int i) {
        this.g = i;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.g;
        if (i == 0) {
            ltg ltgVar = dui.a;
            ((mko) obj).cancel(false);
        } else if (i == 1) {
            ltg ltgVar2 = dui.a;
            ((mko) obj).cancel(false);
        } else if (i == 2) {
            Context context = (Context) obj;
            hsk b2 = hsx.b();
            if (b2 == null) {
                return;
            }
            ins insVar = new ins(17);
            insVar.b(context, R.string.f162480_resource_name_obfuscated_res_0x7f140719, R.string.f160780_resource_name_obfuscated_res_0x7f14066e);
            b2.aC(insVar);
        } else if (i == 3) {
            ((ValueAnimator) obj).cancel();
        } else if (i == 4) {
            ((ValueAnimator) obj).start();
        } else if (i == 5) {
            dzg.c((Context) obj);
        } else {
            ((hdg) obj).h();
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                return Objects.requireNonNull(consumer);
            }
            if (i == 2) {
                return Objects.requireNonNull(consumer);
            }
            if (i == 3) {
                return Objects.requireNonNull(consumer);
            }
            if (i == 4) {
                return Objects.requireNonNull(consumer);
            }
            return i != 5 ? Objects.requireNonNull(consumer) : Objects.requireNonNull(consumer);
        }
        return Objects.requireNonNull(consumer);
    }
}
