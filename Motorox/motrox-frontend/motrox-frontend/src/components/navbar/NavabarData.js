import React from 'react';
import DashboardIcon from '@material-ui/icons/Dashboard';

import CallToActionIcon from '@material-ui/icons/CallToAction';

import StorefrontIcon from '@material-ui/icons/Storefront';

import AttachMoneyIcon from '@material-ui/icons/AttachMoney';

import ListAltIcon from '@material-ui/icons/ListAlt';

import PersonOutlineIcon from '@material-ui/icons/PersonOutline';

import DriveEtaIcon from '@material-ui/icons/DriveEta';

import AccountBoxIcon from '@material-ui/icons/AccountBox';

export const NavbarData = [
    {
        title:"Dashboard",
        icon: <DashboardIcon/>,
        link: "/dashboard"
    },
    {
        title:"Job Card",
        icon: <CallToActionIcon/>,
        link: "/jobcard"
    },
    {
        title:"Item Master",
        icon: <StorefrontIcon/>,
        link: "/itemMask"
    },
    {
        title:"Purchase Order",
        icon: <AttachMoneyIcon/>,
        link: "/purchaseOrder"
    },
    {
        title:"Job Sheet",
        icon: <ListAltIcon/>,
        link: "/jobsheet"
    },
    {
        title:"Customer Details",
        icon: <PersonOutlineIcon/>,
        link: "/customerDetails"
    },
    {
        title:"Supplier Details",
        icon: <PersonOutlineIcon/>,
        link: "/supplierDetails"
    },
    {
        title:"Employee Details",
        icon: <PersonOutlineIcon/>,
        link: "/employeeDetails"
    },
    {
        title:"Vehicle Details",
        icon: <DriveEtaIcon/>,
        link: "/vehicleDetails"
    },
    {
        title:"Profile",
        icon: <AccountBoxIcon/>,
        link: "/profile"
    },
]
    