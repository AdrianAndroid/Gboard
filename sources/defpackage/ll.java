package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: ll  reason: default package */
/* loaded from: classes.dex */
public final class ll extends kk {
    final int c;
    final int d;
    public lh e;
    private MenuItem f;

    public ll(Context context, boolean z) {
        super(context, z);
        if (lk.a(context.getResources().getConfiguration()) == 1) {
            this.c = 21;
            this.d = 22;
            return;
        }
        this.c = 22;
        this.d = 21;
    }

    @Override // defpackage.kk, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        gj gjVar;
        int i;
        lh lhVar;
        lh lhVar2;
        int pointToPosition;
        int i2;
        if (this.e != null) {
            ListAdapter adapter = getAdapter();
            int i3 = 0;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                gjVar = (gj) headerViewListAdapter.getWrappedAdapter();
            } else {
                gjVar = (gj) adapter;
                i = 0;
            }
            nwo nwoVar = null;
            go item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= gjVar.getCount()) ? null : gjVar.getItem(i2);
            MenuItem menuItem = this.f;
            if (menuItem != item) {
                gm gmVar = gjVar.a;
                if (menuItem != null && (lhVar2 = ((lm) this.e).b) != null) {
                    ((gf) lhVar2).a.a.removeCallbacksAndMessages(gmVar);
                }
                this.f = item;
                if (item != null && (lhVar = ((lm) this.e).b) != null) {
                    gf gfVar = (gf) lhVar;
                    gfVar.a.a.removeCallbacksAndMessages(null);
                    int size = gfVar.a.b.size();
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        } else if (gmVar == ((nwo) gfVar.a.b.get(i3)).c) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        int i4 = i3 + 1;
                        if (i4 < gfVar.a.b.size()) {
                            nwoVar = (nwo) gfVar.a.b.get(i4);
                        }
                        gfVar.a.a.postAtTime(new bvr(gfVar, nwoVar, item, gmVar, 1, null, null, null), gmVar, SystemClock.uptimeMillis() + 200);
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        gj gjVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.c) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.d) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                gjVar = (gj) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                gjVar = (gj) adapter;
            }
            gjVar.a.i(false);
            return true;
        }
    }
}
