package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.inputmethod.libs.expression.startactivityforresult.StartActivityForResult;
import j$.util.Objects;
import j$.util.function.BiConsumer;

/* compiled from: PG */
/* renamed from: dxc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dxc implements BiConsumer {
    private final /* synthetic */ int f;
    public static final /* synthetic */ dxc e = new dxc(4);
    public static final /* synthetic */ dxc d = new dxc(3);
    public static final /* synthetic */ dxc c = new dxc(2);
    public static final /* synthetic */ dxc b = new dxc(1);
    public static final /* synthetic */ dxc a = new dxc(0);

    private /* synthetic */ dxc(int i) {
        this.f = i;
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                return Objects.requireNonNull(biConsumer);
            }
            if (i == 2) {
                return Objects.requireNonNull(biConsumer);
            }
            return i != 3 ? Objects.requireNonNull(biConsumer) : Objects.requireNonNull(biConsumer);
        }
        return Objects.requireNonNull(biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            StartActivityForResult.l((Context) obj, new Intent("android.settings.".concat(String.valueOf(jdg.Y((String) obj2)))), 4);
        } else if (i == 1) {
            gib gibVar = new gib((String) obj2, new Bundle());
            StartActivityForResult.l((Context) obj, new Intent().setPackage(gibVar.c).setAction("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS").putExtra("account_name", (String) null).putExtra("assistant_settings_feature", gibVar.a).putExtras(gibVar.b), 3);
        } else if (i == 2) {
            ((llk) obj).h(obj2);
        } else if (i != 3) {
            ((kcl) obj).f((lrh) obj2);
        } else {
            ((lmx) obj).d(obj2);
        }
    }
}
