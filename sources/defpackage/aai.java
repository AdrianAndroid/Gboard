package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@oka(b = "androidx.core.view.ViewKt$allViews$1", c = "View.kt", d = "invokeSuspend", e = {406, 408})
/* renamed from: aai  reason: default package */
/* loaded from: classes.dex */
public final class aai extends okd implements oku {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aai(View view, ojv ojvVar) {
        super(ojvVar);
        this.b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oku
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aai) c(obj, obj2)).b(oji.a);
    }

    @Override // defpackage.ojz
    public final Object b(Object obj) {
        Object obj2;
        ojx ojxVar = ojx.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            oix.c(obj);
            obj2 = this.c;
            View view = this.b;
            this.a = 1;
            if (((omk) obj2).a(view, this) == ojxVar) {
                return ojxVar;
            }
        } else if (i != 1) {
            oix.c(obj);
            return oji.a;
        } else {
            obj2 = this.c;
            oix.c(obj);
        }
        View view2 = this.b;
        if (view2 instanceof ViewGroup) {
            omi s = tp.s((ViewGroup) view2);
            this.c = null;
            this.a = 2;
            if (((omk) obj2).c(s, this) == ojxVar) {
                return ojxVar;
            }
        }
        return oji.a;
    }

    @Override // defpackage.ojz
    public final ojv c(Object obj, ojv ojvVar) {
        aai aaiVar = new aai(this.b, ojvVar);
        aaiVar.c = obj;
        return aaiVar;
    }
}
