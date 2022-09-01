package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: im  reason: default package */
/* loaded from: classes.dex */
public final class im {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        yg yhVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                yhVar = new yf(clipData, 3);
            } else {
                yhVar = new yh(clipData, 3);
            }
            aad.s(textView, oc.b(yhVar));
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    static boolean b(DragEvent dragEvent, View view, Activity activity) {
        yg yhVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            yhVar = new yf(clipData, 3);
        } else {
            yhVar = new yh(clipData, 3);
        }
        aad.s(view, oc.b(yhVar));
        return true;
    }
}
