package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: eil  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eil implements hle {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ eil(ehp ehpVar, String str, int i) {
        this.c = i;
        this.b = ehpVar;
        this.a = str;
    }

    public /* synthetic */ eil(eis eisVar, String str, int i) {
        this.c = i;
        this.b = eisVar;
        this.a = str;
    }

    @Override // defpackage.hle
    public final void a(View view) {
        if (this.c == 0) {
            Object obj = this.b;
            String str = this.a;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.width = (((eis) obj).d.getWidth() - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
            view.setLayoutParams(marginLayoutParams);
            ((AppCompatTextView) view).setText(str);
            return;
        }
        Object obj2 = this.b;
        String str2 = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams2.width = (((ehp) obj2).d.getWidth() - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
        view.setLayoutParams(marginLayoutParams2);
        ((AppCompatTextView) view).setText(str2);
    }
}
