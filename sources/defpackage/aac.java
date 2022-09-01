package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: aac  reason: default package */
/* loaded from: classes.dex */
final class aac {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aac c(View view) {
        aac aacVar = (aac) view.getTag(R.id.f129420_resource_name_obfuscated_res_0x7f0b215e);
        if (aacVar == null) {
            aac aacVar2 = new aac();
            view.setTag(R.id.f129420_resource_name_obfuscated_res_0x7f0b215e, aacVar2);
            return aacVar2;
        }
        return aacVar;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.f129430_resource_name_obfuscated_res_0x7f0b215f);
        if (arrayList != null) {
            int size = arrayList.size();
            do {
                size--;
                if (size < 0) {
                    return false;
                }
            } while (!((aab) arrayList.get(size)).a());
            return true;
        }
        return false;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View b(View view, KeyEvent keyEvent) {
        View b;
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        b = b(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (b == null);
                return b;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
