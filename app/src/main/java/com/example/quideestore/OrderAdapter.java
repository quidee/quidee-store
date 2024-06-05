package com.example.quideestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder> {

    private Context context;
    private List<Order> orderList;

    public OrderAdapter(Context context, List<Order> orderList) {
        this.context = context;
        this.orderList = orderList;
    }

    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.order_item_layout, parent, false);
        return new OrderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position) {
        Order order = orderList.get(position);

        holder.tvOrderStatus.setText(order.getStatus());
        holder.tvOrderPrice.setText(order.getPrice());
        holder.tvOrderTitle1.setText(order.getTitle());
        holder.tvOrderDetail1.setText(order.getDetail());
        holder.tvOrderCode1.setText(order.getCode());
        holder.tvPlaceOrderTimeValue.setText(order.getPlaceOrderTime());
        holder.tvDeliveryEstimateValue.setText(order.getDeliveryEstimate());


    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {

        TextView tvOrderStatus, tvOrderPrice, tvOrderTitle1, tvOrderDetail1, tvOrderCode1, tvPlaceOrderTimeValue, tvDeliveryEstimateValue;
        ImageView iconOrder1;
        LinearLayout llOrderDescription1, llOrderTime;
        RelativeLayout rlOrderDetails1;

        public OrderViewHolder(@NonNull View itemView) {
            super(itemView);

            tvOrderStatus = itemView.findViewById(R.id.tvOrderStatus);
            tvOrderPrice = itemView.findViewById(R.id.tvOrderPrice);
            tvOrderTitle1 = itemView.findViewById(R.id.tvOrderTitle1);
            tvOrderDetail1 = itemView.findViewById(R.id.tvOrderDetail1);
            tvOrderCode1 = itemView.findViewById(R.id.tvOrderCode1);
            tvPlaceOrderTimeValue = itemView.findViewById(R.id.tvPlaceOrderTimeValue);
            tvDeliveryEstimateValue = itemView.findViewById(R.id.tvDeliveryEstimateValue);
            iconOrder1 = itemView.findViewById(R.id.iconOrder1);
            llOrderDescription1 = itemView.findViewById(R.id.llOrderDescription1);
            llOrderTime = itemView.findViewById(R.id.llOrderTime);
            rlOrderDetails1 = itemView.findViewById(R.id.rlOrderDetails1);
        }
    }
}
