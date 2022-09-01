package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: cv  reason: default package */
/* loaded from: classes.dex */
public final class cv extends dt implements DialogInterface {
    final ct a = new ct(getContext(), this, getWindow());

    /* JADX INFO: Access modifiers changed from: protected */
    public cv(Context context, int i) {
        super(context, a(context, i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.f7730_resource_name_obfuscated_res_0x7f04023d, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button b(int i) {
        ct ctVar = this.a;
        return i != -3 ? i != -2 ? ctVar.j : ctVar.m : ctVar.p;
    }

    public final ListView c() {
        return this.a.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0306  */
    @Override // defpackage.dt, defpackage.ox, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.l(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.a.s;
        if (nestedScrollView == null || !nestedScrollView.l(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.dt, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.a.a(charSequence);
    }
}
