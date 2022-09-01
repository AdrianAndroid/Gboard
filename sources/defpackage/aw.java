package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aw  reason: default package */
/* loaded from: classes.dex */
public final class aw implements LayoutInflater.Factory2 {
    final bi a;

    public aw(bi biVar) {
        this.a = biVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        bn h;
        if (as.class.getName().equals(str)) {
            return new as(context, attributeSet, this.a);
        }
        an anVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !at.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1) {
            if (resourceId != -1) {
                i = -1;
            } else if (string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            } else {
                i = -1;
                resourceId = -1;
            }
        }
        if (resourceId != -1) {
            anVar = this.a.d(resourceId);
        }
        if (anVar == null && string != null) {
            anVar = this.a.e(string);
        }
        if (anVar == null && i != -1) {
            anVar = this.a.d(i);
        }
        if (anVar == null) {
            at f = this.a.f();
            context.getClassLoader();
            anVar = f.c(attributeValue);
            anVar.u = true;
            anVar.D = resourceId != 0 ? resourceId : i;
            anVar.E = i;
            anVar.F = string;
            anVar.v = true;
            anVar.z = this.a;
            bi biVar = this.a;
            anVar.A = biVar.i;
            Context context2 = biVar.i.c;
            Bundle bundle = anVar.h;
            anVar.aq();
            h = this.a.g(anVar);
            if (bi.S(2)) {
                new StringBuilder("Fragment ").append(anVar);
                Integer.toHexString(resourceId);
            }
        } else if (anVar.v) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
        } else {
            anVar.v = true;
            anVar.z = this.a;
            bi biVar2 = this.a;
            anVar.A = biVar2.i;
            Context context3 = biVar2.i.c;
            anVar.aq();
            h = this.a.h(anVar);
            if (bi.S(2)) {
                new StringBuilder("Retained Fragment ").append(anVar);
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        aez.b(anVar, viewGroup);
        anVar.N = viewGroup;
        h.d();
        h.c();
        View view2 = anVar.O;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (anVar.O.getTag() == null) {
            anVar.O.setTag(string);
        }
        anVar.O.addOnAttachStateChangeListener(new av(this, h));
        return anVar.O;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
